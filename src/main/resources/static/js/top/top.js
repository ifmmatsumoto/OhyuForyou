// 現在地情報取得
function getCuurentLocation() {
    navigator.geolocation.getCurrentPosition(searchNearnyBath);
}
// 現在地検索
function searchNearnyBath(position) {
    document.getElementById('latitude').value = position.coords.latitude;
    document.getElementById('longitude').value = position.coords.longitude;

    $('#cuurentLocationSearch').submit();
}
// キーワード検索
function searchKeyword() {
    $('#keywordSearch').submit();
}
// おじじ画像切り替え
function changeOjiji(img) {
	var ojiji1 = document.getElementsByClassName("ojiji1")[0];
	var ojiji2 = document.getElementsByClassName("ojiji2")[0];
	img.style.display = 'none';
	if(img.className == "ojiji1") {
		ojiji2.style.display = 'block';
	} else {
		ojiji1.style.display = 'block';
	}
}
