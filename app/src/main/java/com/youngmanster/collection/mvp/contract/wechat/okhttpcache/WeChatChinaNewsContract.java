package com.youngmanster.collection.mvp.contract.wechat.okhttpcache;

import com.youngmanster.collection.been.wechat.WeChatNews;
import com.youngmanster.collectionlibrary.mvp.BasePresenter;
import com.youngmanster.collectionlibrary.mvp.BaseView;

import java.util.List;

/**
 * Created by yangyan
 * on 2018/3/21.
 */

public interface WeChatChinaNewsContract {
	interface View extends BaseView {
		void refreshUI(List<WeChatNews> weChatNews);
	}

	abstract class Presenter extends BasePresenter<View> {
		public abstract void requestChinaNews(int page,int num);
	}
}
