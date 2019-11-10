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
        $('td.prefecture-name').on('click', function switchDisplay(){
            if($('#area-name-list').css('visibility') == 'visible') {
                $('#area-name-list').css('visibility','hidden');
                $('#btn-inner').text('▲');
            }
            else{
                $('#area-name-list').css({'visibility':'visible'});
                $('#btn-inner').text('▼');
            }
        });
});