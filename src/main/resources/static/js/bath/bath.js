var map;
function initMap() {
	// 地図情報の取得
	var gmap = document.getElementById('gmap');
	var bath_lat  = document.getElementById('lat').value;
	var bath_lon  = document.getElementById('lon').value;

	// マップに反映
	var mapPosition = {lat: Number(bath_lat), lng: Number(bath_lon)};
	map = new google.maps.Map(gmap, { center: mapPosition, zoom: 14});

	// マーカーを設定
	var markerOptions = {
			map: map,
			position: mapPosition,
			icon: new google.maps.MarkerImage(
					'/oyfy/img/ojiji/ojiji_pin.png',
					new google.maps.Size(80,50),
					new google.maps.Point(0,0),
					new google.maps.Point(80,25)
			)
	};
	var marker = new google.maps.Marker(markerOptions);
}

// レビュー投稿
function registReview() {
	if(window.confirm('レビューを投稿します。よろしいですか？')) {
		// クッキーに保存
		document.cookie = 'name='+document.bathForm.newyorker.value;
		document.bathForm.submit();
	}
}

// Cookieから投稿者名を取得して初期入力する
(window.onload = function() {
	var r = document.cookie.split(';');
	r.forEach(function(value) {
	    var content = value.split('=');
	    if(content[0] == 'name') {
	    	document.getElementById('newyorker').value = content[1];
	    }
	})
});