// ヘッダーによる子要素の表示切替
$(function() {
    $('.head').on('click', function head(){
    	if (this.children[1].style.display=='none') {
    		this.children[1].style.display='block';
    	} else {
    		this.children[1].style.display='none'
    	}
    });
});

// 全選択
$(function() {
    $('.all').on('click', function all() {
    	// クラス名から駅リストを取得
    	var stations = document.getElementsByClassName(this.className.split(' ')[1]);
        for (i=0; i<stations.length; i++) {
        	// 全選択のチェック状態に合わせる
        	stations[i].checked = this.children[0].checked;
        }
    });
});
/**
 * 検索処理実行時
 */
function searchStation() {
    $('form').submit();
};