function setBathDetail(bathId) {
	// 銭湯詳細情報を取得
	document.bathForm.bathId.value = bathId;
	var form = document.getElementById("bathForm");
	$.ajax("/oyfy/admin/detail", {
		type: 'post',
		data: $(form).serialize(),
		dataType: 'json'
	}).done(function(res) {
		// 取得した銭湯詳細をformにセット
		form = document.getElementById("adminForm");
		// 銭湯ID(変更不可)
		form.bathId.value = res.bathId;
		// 銭湯和名
		form.bathNameJa.value = res.bathNameJa;
		// 銭湯英名
		form.bathNameEn.value = res.bathNameEn;
		// 都道府県コード
		form.bathAreaCode.value = res.bathAreaCode;
		// 市区町村コード
		form.bathCityCode.value = res.bathCityCode;
		// 銭湯画像(base64変換済み)
		if (res.bathImage != null) form.pvImg.src = res.bathImage;
		// 住所 和名
		form.bathAddressJa.value = res.bathAddressJa;
		// 住所 英名
		form.bathAddressEn.value = res.bathAddressEn;
		// 電話番号
		form.bathTel.value = res.bathTel;
		// 銭湯詳細
		form.bathDetail.textContent = res.bathDetail;
		// 入浴料
		form.bathFee.value = res.bathFee;
		// 24時間フラグ
		var bath24hFlg = document.getElementById("bath24hFlg");
		if (res.bath24hFlg == 1) {
			bath24hFlg.checked = true;
		} else {
			bath24hFlg.checked = false;
		}
		// 銭湯種別
		if (res.bathType == 10) document.getElementById("rdo1").checked = true;
		if (res.bathType == 20) document.getElementById("rdo2").checked = true;
		// 営業時間 開始
		if (res.bathTimeSt != null) form.bathTimeSt.value = res.bathTimeSt.substring(0,5);
		// 営業時間 終了
		if (res.bathTimeEd != null) form.bathTimeEd.value = res.bathTimeEd.substring(0,5);
		// 位置情報 緯度
		form.bathPlaceLat.value = res.bathPlaceLat;
		// 位置情報 経度
		form.bathPlaceLon.value = res.bathPlaceLon;
		// 温度 上限
		form.bathTemperatureUp.value = res.bathTemperatureUp;
		// 温度 下限
		form.bathTemperatureLow.value = res.bathTemperatureLow;
		// 定休日
		var holidays = form.bathHoliday;
		var teikyubi = res.bathHoliday;
		// ループして定休日のチェックON
		for (var i=holidays.length-1; i>=0; i--) {
			if(holidays[i].value <= teikyubi) {
				teikyubi = teikyubi - holidays[i].value;
				holidays[i].checked = true;
			}
		}
		// 削除フラグ
		var delFlg = document.getElementById("delFlg");
		if (res.delFlg == 1) {
			delFlg.checked = true;
		} else {
			delFlg.checked = false;
		}
	}).fail(function(err) {
		console.log("失敗");
	});
}