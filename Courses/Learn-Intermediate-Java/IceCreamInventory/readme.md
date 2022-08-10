<html>
 <head>            
 </head>
 <body>
  <div md-src-pos="0..2677">
   <h1 md-src-pos="0..92">Course: <a href="https://www.codecademy.com/learn/learn-intermediate-java" md-src-pos="9..92">LEARN INTERMEDIATE JAVA</a></h1>
   <p md-src-pos="93..164"><span md-src-pos="93..97">From</span> <a href="https://www.codecademy.com/profiles/fernandotona" md-src-pos="98..164">CodeCademy.com</a></p>
   <p md-src-pos="166..194"><strong md-src-pos="166..194">Subject: NESTED CLASSES.</strong></p>
   <h2 md-src-pos="196..325">Project: <a href="https://www.codecademy.com/courses/learn-intermediate-java/projects/java-nested-classes-project" md-src-pos="207..325">Ice Cream Inventory</a></h2>
   <p md-src-pos="327..663"><span md-src-pos="327..343">Congratulations,</span> <span md-src-pos="344..446">you have just landed a new contract to build out an application for a new local ice cream shop in town</span>! <span md-src-pos="448..544">They need a program that will help them sort out and keep track of their inventory of ice cream,</span> <span md-src-pos="545..552">shakes,</span> <span md-src-pos="553..562">slushies,</span> <span md-src-pos="563..577">and smoothies.</span> <span md-src-pos="578..663">This Java program will have to keep count of how many of each product the shop sells.</span></p>
   <h3 md-src-pos="665..685"><strong md-src-pos="668..685">LIST OF TASKS</strong></h3>
   <h4 md-src-pos="686..731"><strong md-src-pos="690..731">Create a nested class named NonVegan.</strong></h4>
   <p md-src-pos="733..814"><strong md-src-pos="733..739">1.</strong> <span md-src-pos="740..773">Create a nested class and name it</span> <code md-src-pos="774..784">NonVegan</code><span md-src-pos="784..785">.</span> <span md-src-pos="786..813">Add the following variables</span>:</p>
   <p md-src-pos="816..836"><code md-src-pos="816..836">int iceCreamCount;</code></p>
   <p md-src-pos="838..855"><code md-src-pos="838..855">int shakeCount;</code></p>
   <p md-src-pos="857..874"><code md-src-pos="857..874">int totalCount;</code></p>
   <p md-src-pos="876..946"><strong md-src-pos="876..882">2.</strong> <span md-src-pos="883..922">Write a method within the nested class,</span> <span md-src-pos="923..928">named</span> <code md-src-pos="929..946">increaseCount()</code></p>
   <p md-src-pos="948..1030"><span md-src-pos="948..956">Write an</span> <code md-src-pos="957..961">if</code> <span md-src-pos="962..996">statement to increase the count of</span> <code md-src-pos="997..1012">iceCreamCount</code> <span md-src-pos="1013..1016">and</span> <code md-src-pos="1017..1029">shakeCount</code><span md-src-pos="1029..1030">.</span></p>
   <p md-src-pos="1032..1196"><span md-src-pos="1032..1083">Use shadowing to increase the count of the variable</span> <code md-src-pos="1084..1096">totalCount</code> <span md-src-pos="1097..1112">both within the</span> <code md-src-pos="1113..1123">NonVegan</code> <span md-src-pos="1124..1130">class,</span> <span md-src-pos="1131..1147">and the variable</span> <code md-src-pos="1148..1160">totalCount</code> <span md-src-pos="1161..1183">in the enclosing class</span> <code md-src-pos="1184..1195">ShopItems</code><span md-src-pos="1195..1196">.</span></p>
   <h4 md-src-pos="1198..1240"><strong md-src-pos="1202..1240">Create a nested class named Vegan.</strong></h4>
   <p md-src-pos="1242..1364"><strong md-src-pos="1242..1248">3.</strong> <span md-src-pos="1249..1309">For this task you will be repeating Task 1 for a class named</span> <code md-src-pos="1310..1317">Vegan</code><span md-src-pos="1317..1318">.</span> <span md-src-pos="1319..1363">Include the following variables in the class</span>:</p>
   <p md-src-pos="1366..1386"><code md-src-pos="1366..1386">int smoothieCount;</code></p>
   <p md-src-pos="1388..1407"><code md-src-pos="1388..1407">int slushieCount;</code></p>
   <p md-src-pos="1409..1426"><code md-src-pos="1409..1426">int totalCount;</code></p>
   <p md-src-pos="1428..1499"><strong md-src-pos="1428..1434">4.</strong> <span md-src-pos="1435..1474">Write a method within the nested class,</span> <span md-src-pos="1475..1480">named</span> <code md-src-pos="1481..1499">increaseCount();</code></p>
   <p md-src-pos="1501..1583"><span md-src-pos="1501..1547">Write an if-statement to increase the count of</span> <code md-src-pos="1548..1563">smoothieCount</code> <span md-src-pos="1564..1567">and</span> <code md-src-pos="1568..1582">slushieCount</code><span md-src-pos="1582..1583">.</span></p>
   <p md-src-pos="1585..1746"><span md-src-pos="1585..1636">Use shadowing to increase the count of the variable</span> <code md-src-pos="1637..1649">totalCount</code> <span md-src-pos="1650..1665">both within the</span> <code md-src-pos="1666..1673">Vegan</code> <span md-src-pos="1674..1680">class,</span> <span md-src-pos="1681..1697">and the variable</span> <code md-src-pos="1698..1710">totalCount</code> <span md-src-pos="1711..1733">in the enclosing class</span> <code md-src-pos="1734..1745">ShopItems</code><span md-src-pos="1745..1746">.</span></p>
   <h4 md-src-pos="1748..1828"><strong md-src-pos="1752..1828">Incorporate your classes into the Main method of the IceCreamShop class.</strong></h4>
   <p md-src-pos="1830..1969"><strong md-src-pos="1830..1836">5.</strong> <span md-src-pos="1837..1872">Create an object of the outer class</span> <code md-src-pos="1873..1884">ShopItems</code><span md-src-pos="1884..1885">.</span> <span md-src-pos="1886..1891">Next,</span> <span md-src-pos="1892..1921">create an object of the class</span> <code md-src-pos="1922..1932">NonVegan</code><span md-src-pos="1932..1933">,</span> <span md-src-pos="1934..1960">and an object of the class</span> <code md-src-pos="1961..1968">Vegan</code><span md-src-pos="1968..1969">.</span></p>
   <p md-src-pos="1971..2188"><strong md-src-pos="1971..1977">6.</strong> <span md-src-pos="1978..1990">Complete the</span> <code md-src-pos="1991..1995">if</code><span md-src-pos="1995..2016">-statement within the</span> <code md-src-pos="2017..2024">while</code> <span md-src-pos="2025..2036">loop in the</span> <code md-src-pos="2037..2043">main</code> <span md-src-pos="2044..2051">method.</span> <span md-src-pos="2052..2069">Call the function</span> <code md-src-pos="2070..2087">increaseCount()</code> <span md-src-pos="2088..2099">within each</span> <code md-src-pos="2100..2104">if</code> <span md-src-pos="2105..2107">or</span> <code md-src-pos="2108..2117">else if</code> <span md-src-pos="2118..2188">block based on the type of order and whether is is vegan or non-vegan.</span></p>
   <p md-src-pos="2190..2290"><strong md-src-pos="2190..2196">7.</strong> <span md-src-pos="2197..2210">Ouside of the</span> <code md-src-pos="2211..2218">while</code> <span md-src-pos="2219..2224">loop,</span> <span md-src-pos="2225..2252">near the end of the method,</span> <span md-src-pos="2253..2289">print the following three statements</span>:</p>
   <p md-src-pos="2292..2361"><code md-src-pos="2292..2361">Thank you for your order! Today we have sold # orders of sweetness!</code></p>
   <p md-src-pos="2363..2405"><span md-src-pos="2363..2368">where</span> <span md-src-pos="2369..2370">#</span> <span md-src-pos="2371..2405">is the total number of items sold.</span></p>
   <p md-src-pos="2407..2448"><code md-src-pos="2407..2448"># items have been ice cream and shakes.</code></p>
   <p md-src-pos="2450..2502"><span md-src-pos="2450..2455">where</span> <span md-src-pos="2456..2457">#</span> <span md-src-pos="2458..2502">is the total number of non-vegan items sold.</span></p>
   <p md-src-pos="2504..2547"><code md-src-pos="2504..2547"># items have been smoothies and slushies.</code></p>
   <p md-src-pos="2549..2597"><span md-src-pos="2549..2554">where</span> <span md-src-pos="2555..2556">#</span> <span md-src-pos="2557..2597">is the total number of vegan items sold.</span></p>
   <h4 md-src-pos="2599..2623"><strong md-src-pos="2603..2623">Run your program</strong></h4>
   <p md-src-pos="2624..2677"><strong md-src-pos="2624..2630">8.</strong> <span md-src-pos="2631..2652">Compile your program.</span> <strong md-src-pos="2653..2659">9.</strong> <span md-src-pos="2660..2677">Run your program.</span></p>
  </div>
 </body>
</html>