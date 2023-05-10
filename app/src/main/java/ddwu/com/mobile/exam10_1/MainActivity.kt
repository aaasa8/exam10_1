package ddwu.com.mobile.exam10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
		lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
				binding = ActivitiyMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

				val dao = SubjectDao()
				val dataList = dao.dataList

				val layoutManager = LinearLayoutManager(this)
				layoutManager.oriebtation = LinearLayoutManager.VERTICAL
				binding.recyclerView.LayoutManager = layoutManager

 				val adapter = MyAdapter(this, R.layout.list_view, dataList)
				binding.recyclerView.adapter = adapter
    }
}