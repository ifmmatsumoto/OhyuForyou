function chooseTag(tag){
    $id_num = tag.getAttribute('id').substring(3);
    $id = '.' + $id_num;

    //選択させたimgのチェック用
    $checked_tag = '#checked_' + $id_num;
    // 検索条件として表示/非表示を制御する
    if ($($id).length) {
        $($id).remove();
        $($checked_tag).css('z-index', -1);
    } else {
        // クリックした画像のIDを設定
        $tag_id = '#' + tag.getAttribute('id');
        $tag_detail = $($tag_id).children('input');
        $tag_ja = $tag_detail.attr('value');

        $($checked_tag).css('z-index', 0);

        $tag_dips = '<li class=' + $id_num + '><a><span>' + $tag_ja + '</span></a></li>';
        $('.tags').append($tag_dips);

        $selectedtag = '<div class=' + $id_num + '>';
        $selectedtag += '<input class=\'itemList\' type="hidden" value=' + '\'' + $tag_ja + '\'/>';
        $selectedtag += '</div>'
        $('#form').append($selectedtag);
    }
};

function checkTemperature(temperature) {
    $temperature_id = '#' + temperature.getAttribute('id').substring(1);

    if ($(temperature).prop("checked") == true) {
        $($temperature_id).prop('checked', true);
    } else {
        $($temperature_id).prop('checked', false);
    }
}

function addName() {
    $(".itemList").each(function(i, o){
        $(o).attr('name', 'illustItemList'+'['+ i + ']' + '.tagNameJa')
      });
    $('form').submit();
};


//
$(function() {
    // 料金スライダー
    $("#slider").slider({
        range: true,
        min: 80,
        max: 3000,
        step: 10,
        values: [460, 2000],
        slide: function(event, ui) {
            var delay = function() {
                var handleIndex = $(ui.handle).data('index.uiSliderHandle');
                var label = handleIndex == 0 ? '#min' : '#max';
                $(label).html('￥' + ui.value).position({
                    my: 'center top',
                    at: 'center bottom',
                    of: ui.handle,
                    offset: "0, 10"
                });
            };

            // wait for the ui.handle to set its position
            setTimeout(delay, 5);
        }
    });

    $('#min').html('￥' + $('#slider').slider('values', 0)).position({
        my: 'center top',
        at: 'center bottom',
        of: $('#slider a:eq(0)'),
        offset: "0, 10"
    });

    $('#max').html('￥   ' + $('#slider').slider('values', 1)).position({
        my: 'center top',
        at: 'center bottom',
        of: $('#slider a:eq(1)'),
        offset: "0, 10"
    });
    // 初期値のセット
    $('#fee_low').val($('#slider').slider( 'values', 0 ));
    $('#fee_high').val($('#slider').slider( 'values', 1 ));
} );