$(function(){
	// ローディング画面表示
	function dispLoad() {
		var h = $(window).height();
		$('#loading__wrapper').css('display','none');
		$('#is-loading ,#loading').height(h).css('display','block');
	}
	// クリック
	$('.loading').on('click',function(){dispLoad();});
	// Enterキー
	$('.loading_inp').keypress(function(e) {
		if (e.which==13) {
			dispLoad();
			// スマホのキーボードを閉じる
			$(".loading_inp").blur();
		}
	});
});
// ブラウザバックで戻ってきた時の処理
window.onpageshow = function(event) {
	if (event.persisted) {
		var h = $(window).height();
		$('#is-loading ,#loading').height(h).css('display','none');
	}
};
