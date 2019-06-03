package com.example.message;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.arouter.ARouterParam;
import com.example.base.arouter.OrderService;
import com.example.base.arouter.ARouterPath;


@Route(path = ARouterPath.FRAGMENT_MESSAGE)
public class MessageFragment extends Fragment implements OrderService {

    private TextView tvMessage;
    private StringBuilder stringBuilder=new StringBuilder();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        ARouter.getInstance().inject(this);
        View view= View.inflate(getActivity(), R.layout.fragment_message, null);
        tvMessage=view.findViewById(R.id.tv_message);
        return view;
    }

    @Override
    public void orderNotify(int count) {
        stringBuilder.append("你成功下了一个订单"+count+"\n");
        tvMessage.setText(stringBuilder.toString());

    }

    @Override
    public void init(Context context) {

    }
}
