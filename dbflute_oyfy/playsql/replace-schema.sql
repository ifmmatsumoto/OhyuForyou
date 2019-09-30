CREATE TABLE `bath` (
  `bath_id` INTEGER NOT NULL AUTO_INCREMENT COMMENT '銭湯ID',
  `bath_name_ja` varchar(255) NOT NULL COMMENT '銭湯 和名',
  `bath_name_en` varchar(255) NOT NULL COMMENT '銭湯 英名',
  `bath_area_code` int(10) NOT NULL COMMENT '都道府県コード(国土交通省API使用コード)',
  `bath_city_code` int(10) NOT NULL COMMENT '市区町村コード(国土交通省API使用コード)',
  `bath_image` varchar(2100) DEFAULT NULL COMMENT 'サムネイル画像',
  `bath_address_ja` varchar(255) DEFAULT NULL COMMENT '住所 和名',
  `bath_address_en` varchar(255) DEFAULT NULL COMMENT '住所 英名',
  `bath_tel` varchar(15) DEFAULT NULL COMMENT '電話番号',
  `bath_detail` varchar(255) DEFAULT NULL COMMENT '詳細情報',
  `bath_fee` int(11) DEFAULT NULL COMMENT '一般入浴料',
  `bath_type` int(2) NOT NULL COMMENT '銭湯種別(10:銭湯 20:スーパー銭湯)',
  `bath_24h_flg` int(1) NOT NULL COMMENT '24時間フラグ(1:24時間営業)',
  `bath_time_st` time DEFAULT NULL COMMENT '営業時間 開始',
  `bath_time_ed` time DEFAULT NULL COMMENT '営業時間 終了',
  `bath_place_lat` double(9,6) DEFAULT NULL COMMENT '位置情報 緯度',
  `bath_place_lon` double(9,6) DEFAULT NULL COMMENT '位置情報 経度',
  `bath_temperature_up` double(3,3) DEFAULT NULL COMMENT '温度 上限',
  `bath_temperature_low` double(3,3) DEFAULT NULL COMMENT '温度 下限',
  `bath_holiday` int(3) DEFAULT NULL COMMENT '定休日(ビット演算で判定 1:日 2:月 4:火 8:水 16:木 32:金 64:土)',
  `del_flg` int(1) NOT NULL COMMENT '削除フラグ(1:削除済み)',
  `create_date` datetime DEFAULT NULL COMMENT '作成日時',
  `update_date` datetime DEFAULT NULL COMMENT '更新日時',
  PRIMARY KEY (`bath_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='銭湯';


CREATE TABLE `bath_tag` (
  `bath_tag_id` INTEGER NOT NULL COMMENT '銭湯ID',
  `bath_id` INTEGER NOT NULL COMMENT '銭湯ID',
  `tag_id` INTEGER NOT NULL COMMENT 'タグID',
   PRIMARY KEY (bath_tag_id),
   UNIQUE (bath_id, tag_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='銭湯タグ';

CREATE TABLE `tag` (
  `tag_id` INTEGER NOT NULL AUTO_INCREMENT COMMENT 'タグID',
  `tag_name_ja` varchar(255) COMMENT 'タグ 和名',
  `tag_name_en` varchar(255) COMMENT 'タグ 英名',
  `tag_image` varchar(2100) COMMENT 'タグ画像',
  `create_date` datetime COMMENT '作成日時',
  `update_date` datetime COMMENT '更新日時',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='タグ';

CREATE TABLE `area` (
  `city_code` int(10) NOT NULL AUTO_INCREMENT COMMENT '市区町村コード',
  `city_name_ja` varchar(255) NOT NULL COMMENT '市区町村名 和名',
  `city_name_en` varchar(255) NOT NULL COMMENT '市区町村名 英名',
  `city_image` varchar(2100) COMMENT 'アイコン画像',
  `city_color` varchar(255) COMMENT 'カラーコード',
  `create_date` datetime COMMENT '作成日時',
  `update_date` datetime COMMENT '更新日時',
  KEY `area_idx` (`city_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='エリア';

CREATE TABLE `station` (
  `station_code` int(10) NOT NULL AUTO_INCREMENT COMMENT '駅コード',
  `station_area_code` varchar(255) NOT NULL COMMENT '都道府県コード',
  `station_line_code` varchar(255) NOT NULL COMMENT '沿線コード',
  `station_line_name_ja` varchar(255) COMMENT '沿線名 和名',
  `station_line_name_en` varchar(255) COMMENT '沿線名 英名',
  `station_g_cd` varchar(255) COMMENT '駅グループコード',
  `station_name_ja` varchar(255) COMMENT '駅名 和名',
  `station_name_en` varchar(255) COMMENT '駅名 英名',
  `station_lon` DOUBLE(9,6) COMMENT '経度',
  `station_lat` DOUBLE(9,6) COMMENT '緯度',
  `station_image` varchar(2100) COMMENT 'アイコン画像',
  `station_color` varchar(255) COMMENT 'カラーコード',
  `create_date` datetime COMMENT '作成日時',
  `update_date` datetime COMMENT '更新日時',
  KEY `station_idx` (`station_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='駅';

alter table bath_tag add constraint FK_BATH_ID
    foreign key (bath_id) references bath (bath_id);