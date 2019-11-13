$(function(){
  /** 追加されるボタンにイベントを追加 */
	// ローディング画面
	$('.loading').on('click',function(){
		var h = $(window).height();
		$('#loading__wrapper').css('display','none');
		$('#is-loading ,#loading').height(h).css('display','block');
	});
});
// ブラウザバックで戻ってきた時の処理
window.onpageshow = function(event) {
	if (event.persisted) {
		var h = $(window).height();
		$('#is-loading ,#loading').height(h).css('display','none');
	}
};
