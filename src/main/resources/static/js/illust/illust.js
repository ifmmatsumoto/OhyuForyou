/**
 *
 */
function chooseTag(tag){
    $id_num = tag.getAttribute('id').substring(3);
    $id = '#' + $id_num;

    //選択させたimgのチェック用
    $seleceted_tag = '#checked_' + $id_num;
    // 検索条件として表示/非表示を制御する
    if ($($id).length) {
        $($id).remove();
        $($seleceted_tag).css('z-index', -1);
    } else {
        // クリックした画像のIDを設定
        $tag_id = '#' + tag.getAttribute('id');
        $tag_detail = $($tag_id).children('input');
        $tag_ja = $tag_detail.attr('value');

        $($seleceted_tag).css('z-index', 0);

        $selectedtag = '<div id=' + $id_num + '>';
        $selectedtag += '<div class=\'dummy\'><span>' + $tag_ja + '</span></div>';
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
    $('#fee-slider').slider( {
        range: true,
        values: [ 460, 1000],
        step:10,
        min: 50,
        max: 3000,
        slide: function( event, ui ) {
            $('#fee_low').val(ui.values[ 0 ]);
            $('#fee_high').val(ui.values[ 1 ]);
            $('#fee_low_disp').text(ui.values[ 0 ]);
            $('#fee_high_disp').text(ui.values[ 1 ]);
        }
    } );
    // 初期値のセット
    $('#fee_low').val($('#fee-slider').slider( 'values', 0 ));
    $('#fee_high').val($('#fee-slider').slider( 'values', 1 ));
    $('#fee_low_disp').text($('#fee-slider').slider( 'values', 0 ));
    $('#fee_high_disp').text($('#fee-slider').slider( 'values', 1 ));

    // 温度スライダー
    $('#temperature-slider').slider( {
        range: true,
        values: [ 20, 45],
        min: 10,
        max: 50,
        slide: function( event, ui ) {
            $('#temperature_low').val(ui.values[ 0 ]);
            $('#temperature_high').val(ui.values[ 1 ]);
        }
    } );
    $('#temperature_low').val($('#temperature-slider').slider( 'values', 0 ));
    $('#temperature_high').val($('#temperature-slider').slider( 'values', 1 ));
} );



