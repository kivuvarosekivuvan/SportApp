package com.rosekn.sportapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rosekn.sportapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val driverDataList= mutableListOf<DriverData>()
    lateinit var driverAdapter:DriverAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        driverAdapter= DriverAdapter(driverDataList)

        binding.rvDrivers.layoutManager=LinearLayoutManager(this)
        binding.rvDrivers.adapter=driverAdapter

        displayDriver()
    }


fun displayDriver(){
            driverDataList.clear()
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.skysports.com%2Ff1%2Fnews%2F24181%2F12822756%2Flewis-hamiltons-race-against-time-is-record-eighth-formula-1-title-dream-still-alive-at-mercedes&psig=AOvVaw1FqHlHeWyWyBsP0owRlK4B&ust=1687845701098000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLiYoa6h4P8CFQAAAAAdAAAAABAE","Lewis Hamilton", "Mercedes", 400))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.si.com%2Ffannation%2Fracing%2Ff1briefings%2Fnews%2Fmax-verstappen-confident-in-rb19-performance-it-feels-nice-well-balanced-lm22&psig=AOvVaw3dwrvJcFdrMZWVigSQJKOt&ust=1687845754031000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLDtgMeh4P8CFQAAAAAdAAAAABAJ","Max Verstappen", "Red Bull Racing",370))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw2TtwUrJee9X2HxNJcI5wcm&ust=1687845806810000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKjO2eCh4P8CFQAAAAAdAAAAABAE","Fernado Alonso", "Ferrari", 365))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.formula1.com%2Fen%2Fdrivers%2Flance-stroll.html&psig=AOvVaw277DqJ2jdzL6fvz5_cAECJ&ust=1687845838024000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJCH8-6h4P8CFQAAAAAdAAAAABAJ","Lance Stroll","Aston martin",320))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw3c3QYTkU7JAmDs8odo11LV&ust=1687845950041000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLi_qaSi4P8CFQAAAAAdAAAAABAJ","Fernado Alonso", "Ferrari", 365))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw3c3QYTkU7JAmDs8odo11LV&ust=1687845950041000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLi_qaSi4P8CFQAAAAAdAAAAABAJ","Fernado Alonso", "Ferrari", 365))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw3c3QYTkU7JAmDs8odo11LV&ust=1687845950041000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLi_qaSi4P8CFQAAAAAdAAAAABAJ","Fernado Alonso", "Ferrari", 365))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw3c3QYTkU7JAmDs8odo11LV&ust=1687845950041000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLi_qaSi4P8CFQAAAAAdAAAAABAJ","Fernado Alonso", "Ferrari", 365))
            driverDataList.add(DriverData("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.astonmartinf1.com%2Fen-GB%2Fdriver%2Ffernando-alonso&psig=AOvVaw3c3QYTkU7JAmDs8odo11LV&ust=1687845950041000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLi_qaSi4P8CFQAAAAAdAAAAABAJ","Fernado Alonso", "Ferrari", 365))
    driverAdapter.notifyDataSetChanged()

}

}