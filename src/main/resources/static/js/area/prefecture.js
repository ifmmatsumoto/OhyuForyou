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

$(function() {
        $("a.switch-btn").on('click', function() {
        $("li.area-name-list").toggle("fast",alertFunc);
});

function alertFunc(){
    if($("li.area-name-list").css('display') == 'none') {
        $("#all").hide();
        $("#btn-inner").text("▲");
    }
    else{
        $("#all").show();
        $("#btn-inner").text("▼");
    }
  };
});