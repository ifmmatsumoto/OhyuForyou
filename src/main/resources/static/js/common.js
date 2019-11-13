$(function(){
  /** 追加されるボタンにイベントを追加 */
	// ローディング画面
	$('.loading').on('click',function(){
		var h = $(window).height();
		$('#loading__wrapper').css('display','none');
		$('#is-loading ,#loading').height(h).css('display','block');
	});
});

