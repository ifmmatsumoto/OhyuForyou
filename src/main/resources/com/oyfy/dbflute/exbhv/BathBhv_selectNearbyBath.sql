/*
 [df:title]
  周辺にある銭湯の検索

 [df:description]
  パラメータ(緯度経度半径)に応じた銭湯を検索する

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

SELECT
  bath.*,
  (
    6371 * acos( -- kmの場合は6371、mileの場合は3959
      cos(radians(/*pmb.bath_place_lat*/35.6804067))
      * cos(radians(bath.bath_place_lat))
      * cos(radians(bath.bath_place_lon) - radians(/*pmb.bath_place_lon*/139.7550152))
      + sin(radians(/*pmb.bath_place_lat*/35.6804067))
      * sin(radians(bath.bath_place_lat))
    )
  ) AS distance
FROM
  bath
HAVING
  distance <= /*pmb.distance*/3 -- 半径3km以内
ORDER BY
  distance -- 近い順(ASC)
;