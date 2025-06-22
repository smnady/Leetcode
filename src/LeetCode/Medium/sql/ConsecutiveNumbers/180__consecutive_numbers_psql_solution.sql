-- https://leetcode.com/problems/consecutive-numbers/description/
-- Table: Logs
--
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | num         | varchar |
-- +-------------+---------+
-- In SQL, id is the primary key for this table.
-- id is an autoincrement column starting from 1.
    --------------------------------------------
-- Find all numbers that appear at least three times consecutively.
-- Return the result table in any order.

WITH sequenced AS (
    SELECT num,
           LEAD(num, 1) OVER (ORDER BY id) AS next1,
            LEAD(num, 2) OVER (ORDER BY id) AS next2
    FROM logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM sequenced
WHERE num = next1
  AND num = next2;