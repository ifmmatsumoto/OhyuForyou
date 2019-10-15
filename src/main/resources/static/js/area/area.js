//都道府県選択時にhiddenにパラメータをセットして送信
$(function(){
    $('.jp_map li a').click(function() {
        id = $(this).attr('id');
        text = $("#"+id).text();
        $("#pref_id").val(id);
        $("#pref_name").val(text);
        $('#form').submit();
    });
});
$(function(){
    $('.jp_map li a').hover(
    //マウスカーソルが重なった時の処理
    function() {
        $(this).css('background-color', 'red');
    },
    //マウスカーソルが離れた時の処理
    function() {
        id = $('.jp_map li a').attr('id');
        $(this).removeAttr('style');
        backgroundColor = $('.jp_map li:nth-child(this) a').css('background-color');
        $(this).css('background-color', backgroundColor);
    }
});