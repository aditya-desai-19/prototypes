import { client } from "./redis.ts";

export const IsRateLimited = async (userId: string, limit: number, window: number) => {
  const currLimit = await client.get(userId);
  if (currLimit === null) {
    await client.set(userId, 1);
    await client.expire(userId, window);
    return false;
  }
  
  const currLimitNum = parseInt(currLimit);
  if (currLimitNum >= limit) {
    return true;
  }

  await client.incr(userId);
}