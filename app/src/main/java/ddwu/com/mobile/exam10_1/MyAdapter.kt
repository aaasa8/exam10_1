package ddwu.com.mobile.exam10_1

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val layout: Int, val list: ArrayList<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
		// 각 항목의 뷰를 보관하는 Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(layout, parent, false)
				return MyViewHolder(this, view, list)
    }
		// Holder에 보관중인 뷰에 원본 데이터 연결
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.tvText.text = list[position]
    }
		// recyclerView에 표시할 전체 뷰의 개수 == 원본 데이터의 개수
    override fun getItemCount(): Int {
        return list.size
    }
		// 항목의 뷰를 생성한 후 멤버변수로 보관하는 ViewHolder
		class MyViewHolder(adapter: MyAdapter, view: View, dataList: ArrayList<Sting>) : RecyclerView.ViewHolder(view) {
			val tvText : TextView = view.findViewById(R.id.tvText)
			init{
				view.setOnClickListener {
					Toast.makeText(view.context, "${dataList[adapterPosition]}", Toast.LENGTH_SHORT).show()
					dataList.removeAt(adapterPosition)
					adapter.notifyDataSetChanged()
				}
			}
		}
}