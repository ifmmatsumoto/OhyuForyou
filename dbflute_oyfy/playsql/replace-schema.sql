CREATE TABLE `t_bath_tag` (
  `bath_id` int(10) NOT NULL COMMENT '銭湯ID',
  `tag_id` int(10) NOT NULL COMMENT 'タグID',
  KEY `t_bath_tag_idx` (`bath_id`,`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='銭湯タグ';

CREATE TABLE `t_tag` (
  `tag_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'タグID',
  `tag_name_ja` varchar(255) NOT NULL COMMENT 'タグ 和名',
  `tag_name_en` varchar(255) NOT NULL COMMENT 'タグ 英名',
  `tag_image` varchar(2100) COMMENT 'タグ画像',
  `create_date` datetime COMMENT '作成日時',
  `update_date` datetime COMMENT '更新日時',
  KEY `t_tag_idx` (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='タグ';

CREATE TABLE `t_bath` (
  `bath_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '銭湯ID',
  `bath_name_ja` varchar(255) NOT NULL COMMENT '銭湯 和名',
  `bath_name_en` varchar(255) NOT NULL COMMENT '銭湯 英名',
  `bath_area_code` int(10) NOT NULL COMMENT '都道府県コード(国土交通省API使用コード)',
  `bath_city_code` int(10) NOT NULL COMMENT '市区町村コード(国土交通省API使用コード)',
  `bath_image` varchar(2100) COMMENT 'サムネイル画像',
  `bath_address_ja` varchar(255) COMMENT '住所 和名',
  `bath_address_en` varchar(255) COMMENT '住所 英名',
  `bath_tel` varchar(15) COMMENT '電話番号',
  `bath_fee` int COMMENT '一般入浴料',
  `bath_type` int(2) NOT NULL COMMENT '銭湯種別(10:銭湯 20:スーパー銭湯)',
  `bath_24h_flg` int(1) NOT NULL COMMENT '24時間フラグ(1:24時間営業)',
  `bath_time_st` TIME COMMENT '営業時間 開始',
  `bath_time_ed` TIME COMMENT '営業時間 終了',
  `bath_place_lat` DOUBLE(9,6) COMMENT '位置情報 緯度',
  `bath_place_lon` DOUBLE(9,6) COMMENT '位置情報 経度',
  `bath_temperature_up` DOUBLE(3,3) COMMENT '温度 上限',
  `bath_temperature_low` DOUBLE(3,3) COMMENT '温度 下限',
  `bath_holiday` int(3) COMMENT '定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)',
  `del_flg` int(1) NOT NULL COMMENT '削除フラグ(1:削除済み)',
  `create_date` datetime COMMENT '作成日時',
  `update_date` datetime COMMENT '更新日時',
  KEY `t_bath_idx` (`bath_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='銭湯';