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

// 表示、非表示処理
$(function() {
        $('#area-name-list').css({'display':'none'});
        $('#form').css({'max-height':'65vh'});
        $('td.prefecture-name').on('click', function switchDisplay(){
            if($('#area-name-list').css('display') == 'none') {
                $('#area-name-list').css('display','block');
                $('#form').css({'max-height':''});
                $('#btn-inner').text('▲');
            }
            else{
                $('#area-name-list').css({'display':'none'});
                $('#form').css({'max-height':'65vh'});
                $('#btn-inner').text('▼');
            }
        });
});