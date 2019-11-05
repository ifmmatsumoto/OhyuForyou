function getCuurentLocation() {
    navigator.geolocation.getCurrentPosition(searchNearnyBath);
}
function searchNearnyBath(position) {
    document.getElementById('latitude').value = position.coords.latitude;
    document.getElementById('longitude').value = position.coords.longitude;

    $('#cuurentLocationSearch').submit();
}
function searchKeyword() {
    $('#keywordSearch').submit();
}
