//初期設定、表示/非表示処理
$(function() {

    // 初期化
    var stockId = 0

    var tables = document.getElementsByClassName('table table-bordered');

    //table毎に処理をさせる
    for (var i = 0, tableLen = tables.length; i < tableLen; i++) {

        var changeIdTable = $('table').get(i);
        changeIdTable.setAttribute('id', 'search_station' + i);

        var targetTable = document.getElementById('search_station' + i);

        var targetSpan = targetTable.getElementsByTagName("span")[0];

        // ▼▲ボタンのidを指定
        targetSpan.setAttribute('id', 'lineNames' + i);

        targetSpan.classList.add('lineNames' + i);

        var targetTr = targetTable.rows[1];
        targetTr.classList.add('stationsRow' + i);

        // 路線列のtdのnameを設定
        // tr内のtdをループ。cellsコレクションで行内セル位置取得。
        var targetTd = targetTable.rows[1].cells[0];
        targetTd.setAttribute('id', 'stationNames' + i);

        var switchTd = targetTable.rows[0].cells[0];
        switchTd.setAttribute('id', 'lineNames' + i);

        targetTextArea = switchTd.getElementsByTagName("div")[0];

        // 路線名表示箇所のidを指定
        targetTextArea.setAttribute('id', 'lineNames' + i);

        // tr直下の子要素（路線名が表示されるtd）
        var inputObject = $(".stationsRow" + i)[0].getElementsByTagName("input");

        // 初期表示では駅名を表示するtdをすべて非表示にする
        $('#stationNames' + i).css({'display':'none'});

        // 駅名checkboxの数を取得
        var checkboxLen = inputObject.length;

        for (var k = 0, checkboxLen; k < checkboxLen; k++) {

            if(k==0) {
                stockId = stockId + 1;

                // 全選択チェックボックスのidを設定する
                inputObject[k].setAttribute("id", "all_" + stockId);
            }
            else {
            	// TODO これがあると駅選択できない
                // 1table分の「全選択チェックボックス」以外に対してnameを設定
//                inputObject[k].setAttribute("name", "stations" + stockId);
            }
        }
    }
        $('td.line-name').on('click', function switchDisplay(event){
            preName = event.target.id;

            replaceName = preName.replace('line' , 'station');

            if($('#' + replaceName).css('display') == 'none') {
                $('#' + replaceName).css('display', '');
                $('span.' + replaceName).text('▲');
            }
            else{
                $('#' + replaceName).css({'display':'none'});
                $('span.' + replaceName).text('▼');
            }
        });
});

//チェックボックスの全選択クリック動作
$(function() {
    $('td.station-name-list').on('click', function allChecker(event){
        var allCheckId = event.target.id;
        doCheck(allCheckId);
    });
});

//全選択処理
function doCheck(baseId) {

	baseIdLen = baseId.length;

    if(baseIdLen == 5) {
     // 駅数が1桁
     agumentName = baseId.substr(-1, 1);
    }
    else {
     // 駅数が2桁
     agumentName = baseId.substr(-2, 2);
    }

    targetCheckBox = 'input[name=' + '"stations' + agumentName + '"' + ']'

    // もし「全てにチェック」のチェックが入ったら
    if ($('#' + baseId).prop('checked')) {
        // チェックを付ける
        $(targetCheckBox).prop('checked', true);
        // もしチェックが外れたら
    } else {
        // チェックを外す
        $(targetCheckBox).prop('checked', false);
    }

    var result = true;
    return result;
};

/**
 * 検索処理実行時
 */
function searchStation() {

//    var tables = document.getElementsByClassName('table table-bordered');
//
//    //table毎に処理をさせる
//    for (var i = 0, tableLen = tables.length; i < tableLen; i++) {
//
//        var targetTable = document.getElementById('search_station' + i);
//
//        var targetTr = targetTable.rows[1];
//
//        // tr内のtdをループ。cellsコレクションで行内セル位置取得。
//        var targetTd = targetTable.rows[1].cells[0];
//
//        // tr直下の子要素（路線名が表示されるtd）
//        var inputObject = $(".stationsRow" + i)[0].getElementsByTagName("input");
//
//        // 駅名checkboxの数を取得
//        var checkboxLow = inputObject.length;
//    }

//    // checkbox分ループ
//    for (var k = 0, checkboxLow; k < checkboxLow; k++) {
//        stationRow[k].setAttribute("name", "stationNames");
//    }

    $('form').submit();
};