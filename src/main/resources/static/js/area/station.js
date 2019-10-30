/**
 *
 */
function searchStation() {
    const targetTable = document.getElementById('search_station');

    for (var i = 0, rowLen = targetTable.rows.length; i < rowLen; i++) {

        // tr内のtdをループ。cellsコレクションで行内セル位置取得。
        for (var j = 0, colLen = targetTable.rows[i].cells.length; j < colLen; j++) {

            // tr直下の子要素（路線名が表示されるtd）
            var trObject = $(".stationsRow" + i).children('[id=all]');

            // trObject配下にある子要素に存在するinput要素
            var inputObject = trObject.prevObject[0].children[0]
                    .getElementsByTagName("input");

            // trObject配下にある2番目の子要素に存在するinput要素
            var stationRow = trObject.prevObject[0].children[1]
                    .getElementsByTagName("input");

            // 駅名checkboxの数を取得
            var checkboxLow = stationRow.length;

            // checkbox分ループ
            for (var k = 0, checkboxLow; k < checkboxLow; k++) {
                stationRow[k].setAttribute("name", "stationNames");
            }

        }
    }
    $('form').submit();
};

// jqueryのセレクタ値を取得
function getClassName(n) {
    var targetTable = document.getElementById('search_station');
    var targetClassName = document.getElementsByClassName('stations' + n);

    var findClassName = targetClassName[0].getAttribute("class", "stations0");

    return findClassName;
};

//tableのrowの数を取得
$(function() {
    const targetTable = document.getElementById('search_station');

    var targetDocument = document.getElementsByClassName('line-name');
    var targetCheckBox = targetDocument[0].getElementsByTagName("input");

    for (var i = 0, rowLen = targetTable.rows.length; i < rowLen; i++) {

        var targetTr = targetTable.rows[i];
        targetTr.classList.add('stationsRow' + i);

        // 路線列のtdのnameを設定
        // tr内のtdをループ。cellsコレクションで行内セル位置取得。
        for (var j = 0, colLen = targetTable.rows[i].cells.length; j < colLen; j++) {
            // 駅名を出力するtdに対してクラス名を追加
            if (j = 1) {
                var targetTd = targetTable.rows[i].cells[j];
                targetTd.classList.add('stations' + i);
            }

            // tr直下の子要素（路線名が表示されるtd）
            var trObject = $(".stationsRow" + i).children('[id=all]');

            // trObject配下にある子要素に存在するinput要素
            var inputObject = trObject.prevObject[0].children[0]
                    .getElementsByTagName("input");

            inputObject.lineCheck.setAttribute("name", "stations" + i);

            // trObject配下にある2番目の子要素に存在するinput要素
            var stationRow = trObject.prevObject[0].children[1]
                    .getElementsByTagName("input");

            // 駅名checkboxの数を取得
            var checkboxLow = stationRow.length;

            // checkbox分ループ
            for (var k = 0, checkboxLow; k < checkboxLow; k++) {
                stationRow[k].setAttribute("name", "stations" + i);
            }

        }
    }
});

// チェックボックスの全選択
$(function() {

    // 「全てにチェック」のチェックボックスをチェックしたら発動
    $('[id=all]').change(function() {

        allCheckerName = this.name;
        agumentName = allCheckerName.substr(-1, 1);

        // 対象のtdクラス名を取得する
        var tdName = getClassName(agumentName);

        targetCheckBox = 'input[name=' + '"' + tdName + '"' + ']'

        // もし「全てにチェック」のチェックが入ったら
        if ($(this).prop('checked')) {

            // チェックを付ける
            $(targetCheckBox).prop('checked', true);

            // もしチェックが外れたら
        } else {

            // チェックを外す
            $(targetCheckBox).prop('checked', false);
        }

    });
});