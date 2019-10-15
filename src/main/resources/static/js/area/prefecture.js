/**
 *
 */
function searchPrefecture() {
    $(".itemList").each(function(i, o){
        $(o).attr('name', 'prefectureList'+'['+ i + ']' + '.tagNameJa')
      });
	$('form').submit();
};

$(function() {

    // 「全てにチェック」のチェックボックスをチェックしたら発動
    $('#all').change(function() {

        // もし「全てにチェック」のチェックが入ったら
        if ($(this).prop('checked')) {

            // チェックを付ける
            $('input[name="prefectures"]').prop('checked', true);

            // もしチェックが外れたら
        } else {

            // チェックを外す
            $('input[name="prefectures"]').prop('checked', false);
        }

    });
});