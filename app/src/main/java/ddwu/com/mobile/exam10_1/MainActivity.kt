package ddwu.com.mobile.exam10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

				val dao = SubjectDao()
				val dataList = dao.dataList

				val layoutManager = LinearLayoutManager(this)
				layoutManager.oriebtation = LinearLayoutManager.VERTICAL
				binding.recyclerView.LayoutManager = layoutManager

				val adapter = MyAdapter(this, R.layout.list_view, dataList)
				binding.recyclerView.adapter = adapter
    }
}