											# Health Service on Wear OS


***Introduction:***
   Health Services is a component of Wear OS. It gives apps the ability to manage sensors, track exercises, create objectives, and deliver metrics like heart rate, step count, calories burned, distance traveled, and many�more things. Apps that use Health Services have better battery life and more reliable, consistent health and fitness tracking.

	* Wear OS simplify and accelerate user interface development and its possible to create beautiful, modern UIs for Wear app.
	* Health Services delivers high quality real-time sensor data to your Wear app so you can easily build health and fitness experiences in a power-efficient way.

	A feature named Health Services is part of Wear OS 3. In order to give apps access to high-quality data about activity, exercise, and health, Health Services acts as a middleman between the different sensors and associated algorithms on the device.

***What is Wear Os?***
      Wear Os is a smartwatch operating system created by Google. Wear Os also known as Android Wear, which had been launched on March 18, 2014[3]. A wrist-based device may perform a variety of cutting-edge smart operations thanks to Wear OS. The transmission of smartphone alerts, location tracking, texting and voice calls, music playback, and heart rate monitoring are all included in this. Wear OS 3 was first available in August 2021[3] corresponding to API level 30 and it includes a service called Health Services.

***Health Service:***
	Any service that can contribute to improved health is called Health Services. Health Services provides an advanced set of APIs that allow your application to take full advantage of the powerful hardware[1].  This component has the task of providing applications with various basic functionalities, such as sensor management and training monitoring, as well as various metrics, such as heart rate, step count, calories, distance, etc[2].

***Why health services are beneficial to app developers?***
	Messages app can keep conversations synced between the watch and the phone so that it is simple to pick up where a discussion left off, Google Maps will provide turn-by-turn directions from the watch[2]. Google is also collaborating with businesses like Spotify, Strava, and MyFitnessPal to release updated apps with the help of�Wear OS 3-specific capabilities. Health Services automatically collect sensor data, setup all fitness- and health-related sensors for the use-case, and compute measurements like heart rate, distance, calories, elevation, floors, speed, pace�and many�more[3].�Apps can register for this data directly from Health Services.�

	Apps without Health Services must connect to one or more sensors, properly configure each one, receive raw sensor data, and then apply their own algorithms to extract useful information. For instance, a mobile application might sign up for�updates. Sensor.TYPE_PRESSURE can obtain the current air pressure, and use it to determine the current altitude, and combine this information across time to display the elevation changes that occurred while a user was participating in an activity[1]. At the same way Sensor.TYPE_ACCELEROMETER Use to measures the acceleration force and detect motion shake, tilt, etc. Sensor.TYPE_GYROSCOPE Use to Measures a device's rate of rotation in rad/s and detect Rotation spin, turn, etc.  Sensor.TYPE_AMBIENT_TEMPERATURE Use to measures the ambient room temperature in degrees Celsius (�C) and monitor air temperatures. Sensor.TYPE_GRAVITY Use to measures the force of gravity in m/s2 that is applied to a device to detect motion shake, tilt, etc.  Sensor.TYPE_MAGNETIC_FIELD Use to measures the ambient geomagnetic field and use to Creating a compass. Sensor.TYPE_LIGHT Use to measures the ambient light level to Controlling screen brightness. Sensor.TYPE_RELATIVE_HUMIDITY Use to measures the relative ambient humidity in percent and to monitor dewpoint, absolute, and relative humidity. Sensor.TYPE_PROXIMITY Use to measures the proximity of an object in cm relative to the view screen of a device. This sensor is typically used to determine whether a handset is being held up to a person's ear to detect Phone position during a call. Sensor.TYPE_STEP_DETECTOR A sensor of this type triggers an event each time a step is taken by the user. If only need aggregate number of steps taken over a period of time, register for Sensor.TYPE_STEP_COUNTER[4] and Sensor.TYPE_HEART_RATE Use to measure heart rate and describe a heart rate monitor, so on and on. 

***Advantages of using Health Services to Develop Wearable App:***
	* Utilize the platform's natively operating sophisticated algorithms[1].
	* Utilize sensor setups from Health Services that are designed to be power-efficient to conserve battery[1].
	* Make an app for Wear 3 devices future-proof. It is simpler to keep your app up to date because the Health Services API is the same across Wear 3 devices[1].
	* Utilize standardized platform computations to guarantee data consistency among all programs running on the same device[1].
	* Enable experiences that are activity-aware, such as the capability to recognize a running workout that was initiated by another app[1].

***Conclusion:***
	All of these provide developers the freedom to concentrate on creating distinctive features and user interfaces while trusting the platform to deliver reliable metrics in a power-efficient manner, and it can be said that it is not true that without using health services to develop an app, it is not possible or something, but it is clear that with the help of health services, it would be very easy and beneficial.



***References:***
	[^1] Android Developers. 2022.�Health Services on Wear OS �|� Android Developers. [online] Available at: <https://developer.android.com/training/wearables/health-services> [Accessed 11 October 2022].
	[^2] Android Central. 2022.�Wear OS 3 is finally enticing developers again after years of neglect. [online] Available at: <https://www.androidcentral.com/wear-os-google-android-samsung> [Accessed 11 October 2022].
	[^3] TechRadar. 2022.�Wear OS 3.5 is here: features, supported watches and everything you need to know. [online] Available at: <https://www.techradar.com/news/wear-os-3> [Accessed 11 October 2022].
	[^4] Programcreek.com. 2022.�android.hardware.Sensor#TYPE_PRESSURE. [online] Available at: <https://www.programcreek.com/java-api-examples/?class=android.hardware.Sensor&method=TYPE_PRESSURE> [Accessed 11 October 2022].

