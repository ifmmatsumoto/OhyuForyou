/**
 *
 */
function addName() {
    $('form').submit();
};

// チェックボックスの全選択
$(function() {

  // 「全てにチェック」のチェックボックスをチェックしたら発動
  $('#all').change(function() {

    // もし「全てにチェック」のチェックが入ったら
    if ($(this).prop('checked')) {

      // チェックを付ける
      $('input[name="stations"]').prop('checked', true);

    // もしチェックが外れたら
    } else {

      // チェックを外す
      $('input[name="stations"]').prop('checked', false);
    }

  });
});