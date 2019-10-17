/**
 *
 */
function searchPrefecture() {
	$('form').submit();
};

$(function() {

    // 「全てにチェック」のチェックボックスをチェックしたら発動
    $('#all').change(function() {

        // もし「全てにチェック」のチェックが入ったら
        if ($(this).prop('checked')) {

            // チェックを付ける
            $('input[name="prefectureNames"]').prop('checked', true);

            // もしチェックが外れたら
        } else {

            // チェックを外す
            $('input[name="prefectureNames"]').prop('checked', false);
        }

    });
});