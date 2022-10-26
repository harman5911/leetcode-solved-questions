# Write your MySQL query statement below
SELECT Users.name,
IF (ISNULL(sum(Rides.distance)), 0, sum(Rides.distance)) as travelled_distance
FROM Users
LEFT JOIN Rides ON Users.id = Rides.user_id
GROUP BY Users.id
ORDER BY travelled_distance DESC, name
