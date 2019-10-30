Motion Layout Sample
============

My goal is just to play with Motion Layout features. It should allow us to make cool effects in easy way. I realised a circle menu component with sequential expand effect.


Preview
--------------
<img src="circlemenu.gif" width="250"/>


Technical description
--------------
* [MainActivity.kt](/app/src/main/java/com/example/circlemenu/MainActivity.kt) : One activity to display component 
* [Menu.kt](/app/src/main/java/com/example/circlemenu/Menu.kt) : The Menu component witch implement motion layout and manage clic listeners.
* [menu.xml](/app/src/main/res/layout/menu.xml) : A layout xml file for starting state.
* [menu_expended.xml](/app/src/main/res/layout/menu_expended.xml) : A layout xml file for ending state.
* [scene_menu.xml](/app/src/main/res/xml/scene_menu.xml) : One last xml file for customing transition (timing, sequencing, effects, ...).

Environment & Libraries
--------------

* [Constraint Layout v2.0.0](https://developer.android.com/training/constraint-layout/motionlayout) 

My opinion
--------------

Motion Layout is a very simple way to create cool animations. You create the start and end states with direct rendering in the Android Studio Design tool. This is much more accessible than the animation class manipulations around the "animate" method. However, it can take a long time to tweak advanced effects. One could possibly criticize the multiplication of xml files strongly dependent. Finally, I found that Motion Layout does not require much effort and this exercise makes me want to use it in my projects.


License
-------

```
Copyright 2019 Grégory Waeles

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
```