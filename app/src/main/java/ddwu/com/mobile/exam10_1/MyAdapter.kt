package ddwu.com.mobile.exam10_1

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val layout: Int, val list: ArrayList<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        return list.size
    }
}