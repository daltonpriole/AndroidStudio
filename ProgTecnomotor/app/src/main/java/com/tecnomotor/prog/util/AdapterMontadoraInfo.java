package com.tecnomotor.Prog.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tecnomotor.Prog.R;
import com.tecnomotor.Prog.model.MontadoraInfo;

import java.util.List;

public class AdapterMontadoraInfo extends BaseAdapter {

    private List<MontadoraInfo> montadoraInfo;
    private Activity act;

    public AdapterMontadoraInfo(List<MontadoraInfo> montadoraInfo, Activity act){
        this.montadoraInfo = montadoraInfo;
        this.act = act;
    }

    @Override
    public int getCount() {
        return montadoraInfo.size();
    }

    @Override
    public Object getItem(int i) {
        return montadoraInfo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view_return = act.getLayoutInflater().inflate(R.layout.activity_item_info, viewGroup,false);
        MontadoraInfo mf = montadoraInfo.get(i);
        TextView veiculo = (TextView) view_return.findViewById(R.id.textView_conteudo_veiculo);
        TextView motorizacao = (TextView) view_return.findViewById(R.id.textView_conteudo_motorizacao);

        veiculo.setText(mf.getVeiculo().getNome());
        motorizacao.setText(mf.getMotorizacao().getNome());
        return view_return;
    }
}
