import express from 'express';
import { connectRedis } from './redis.ts';
import { IsRateLimited } from './rate-limit.ts';

const app = express();

app.get('/', function (req, res) {
  res.send('Hello World!');
});

app.get('/test/:userId', async function (req, res) {
  const userId = req.params.userId;
  const isRateLimited = await IsRateLimited(userId, 5, 60); // 5 requests per minute
  if (isRateLimited) {
    res.status(429).send('Too Many Requests');
  } else {
    res.send('Test endpoint');
  }
});

async function startServer() {
  try {
    await connectRedis();
    
    app.listen(3000, () => {
      console.log('Server is running on port 3000');
    });
  } catch (error) {
    console.error('Failed to connect to Redis:', error);
    process.exit(1);
  }
}

startServer();