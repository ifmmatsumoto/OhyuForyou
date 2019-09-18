var Base64 = {
    encode: function(str) {
        return btoa(unescape(encodeURIComponent(str)));
    },
    decode: function(str) {
        return decodeURIComponent(escape(atob(str)));
    }
};
function setBathDetail(bathId) {
	// 銭湯詳細情報を取得
	document.bathForm.bathId.value = bathId;
	var form = document.getElementById("bathForm");
	$.ajax("/admin/detail", {
		type: 'post',
		data: $(form).serialize(),
		dataType: 'json'
	}).done(function(res) {
		// 取得した銭湯詳細をformにセット
		form = document.getElementById("adminForm");
		form.bathId.value = res.bathId;
		form.bathNameJa.value = res.bathNameJa;
		form.bathNameEn.value = res.bathNameEn;
		form.bathAreaCode.value = res.bathAreaCode;
		form.bathCityCode.value = res.bathCityCode;
		if (res.bathImage != null) {
			var blob = new Blob([res.bathImage], { type: "image/jpg" });
			var reader = new FileReader();
			reader.onload = function() {
			var b64 = reader.result;
			  console.log(b64);
			  form.pvImg.src = "data:image/jpg;base64," + window.btoa(b64)
			}
			reader.readAsDataURL(blob);
		}
		form.bathAddressJa.value = res.bathAddressJa;
		form.bathAddressEn.value = res.bathAddressEn;
		form.bathTel.value = res.bathTel;
		//form.bathDetail.value = res.bathDetail;
		form.bathFee.value = res.bathFee;
		//form.24hFlg.value = res.24hFlg;
		//form.bathType.value = res.bathType;
		// 時間を整形 15:20:00 → 15:20
		if (res.bathTimeSt != null) form.bathTimeSt.value = res.bathTimeSt.substring(0,5);
		if (res.bathTimeEd != null) form.bathTimeEd.value = res.bathTimeEd.substring(0,5);
		form.bathPlaceLat.value = res.bathPlaceLat;
		form.bathPlaceLon.value = res.bathPlaceLon;
		form.bathTemperatureUp.value = res.bathTemperatureUp;
//		form.bathHoliday.value = res.bathHoliday;
		form.delFlg.value = res.delFlg;
	}).fail(function(err) {
		console.log("失敗");
	});
}