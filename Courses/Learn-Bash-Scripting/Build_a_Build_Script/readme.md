<html>
 <body>
  <div md-src-pos="0..4420">
   <h1 md-src-pos="0..80">Course: <a href="https://www.codecademy.com/learn/bash-scripting" md-src-pos="9..80">LEARN BASH SCRIPTING</a></h1>
   <p md-src-pos="81..152"><span md-src-pos="81..85">From</span> <a href="https://www.codecademy.com/profiles/fernandotona" md-src-pos="86..152">CodeCademy.com</a></p>
   <p md-src-pos="154..181"><strong md-src-pos="154..181">Subject: Bash Scripting</strong></p>
   <h2 md-src-pos="183..293">Project: <a href="https://www.codecademy.com/courses/bash-scripting/projects/bash-scripting-p" md-src-pos="194..293">Build a Build Script</a></h2>
   <p md-src-pos="295..520"><span md-src-pos="295..344">One common use of bash scripts is for releasing a</span> <span md-src-pos="345..352">“build”</span> <span md-src-pos="353..373">of your source code.</span> <span md-src-pos="374..520">Sometimes your private source code may contain developer resources or private information that you don’t want to release in the published version.</span></p>
   <p md-src-pos="522..639"><span md-src-pos="522..538">In this project,</span> <span md-src-pos="539..639">you’ll create a release script to copy certain files from a source directory into a build directory.</span></p>
   <p md-src-pos="641..798"><a href="https://github.com/fernandotonacoder/CodeCademyProjects/releases/tag/Learn_Bash_Scripting_Build_a_Build_Script" md-src-pos="641..798">CHECKOUT THE FINAL RELEASE OF THIS PROJECT!</a></p>
   <p md-src-pos="800..809"><br><br></p>
   <h3 md-src-pos="810..830"><strong md-src-pos="813..830">LIST OF TASKS</strong></h3>
   <h4 md-src-pos="832..856"><strong md-src-pos="836..856">START THE SCRIPT</strong></h4>
   <p md-src-pos="858..1039"><strong md-src-pos="858..864">1.</strong> <span md-src-pos="865..883">Take a look at the</span> <strong md-src-pos="884..893">build</strong> <span md-src-pos="894..897">and</span> <strong md-src-pos="898..908">source</strong> <span md-src-pos="909..917">folders.</span> <span md-src-pos="918..967">The objective of our script is to copy files from</span> <strong md-src-pos="968..978">source</strong> <span md-src-pos="979..981">to</span> <strong md-src-pos="982..991">build</strong><span md-src-pos="991..992">,</span> <span md-src-pos="993..1039">with a couple of exceptions and modifications.</span></p>
   <p md-src-pos="1041..1135"><span md-src-pos="1041..1088">Get started on the script by adding a header to</span> <strong md-src-pos="1089..1102">script.sh</strong><span md-src-pos="1102..1103">,</span> <span md-src-pos="1104..1135">identifying the type of script.</span></p>
   <p md-src-pos="1137..1139"><span md-src-pos="1137..1139">--</span></p>
   <p md-src-pos="1141..1223"><strong md-src-pos="1141..1147">2.</strong> <span md-src-pos="1148..1185">Let’s welcome the user to the script.</span> <span md-src-pos="1186..1223">Feel free to use your own style here.</span></p>
   <p md-src-pos="1225..1309"><span md-src-pos="1225..1255">Make sure to save your script.</span> <span md-src-pos="1256..1294">Test your script in the terminal using</span> <code md-src-pos="1295..1308">./script.sh</code><span md-src-pos="1308..1309">.</span></p>
   <p md-src-pos="1311..1313"><span md-src-pos="1311..1313">--</span></p>
   <p md-src-pos="1315..1457"><strong md-src-pos="1315..1321">3.</strong> <span md-src-pos="1322..1356">Since we are creating a new build,</span> <span md-src-pos="1357..1406">let’s verify with the user that they have updated</span> <strong md-src-pos="1407..1423">changelog.md</strong> <span md-src-pos="1424..1457">with the current release version.</span></p>
   <p md-src-pos="1459..1545"><span md-src-pos="1459..1544">The first line of the file contains a version number with markdown formatting like so</span>:</p>
   <p md-src-pos="1547..1557"><code md-src-pos="1547..1557">## 1.1.1</code></p>
   <p md-src-pos="1559..1707"><span md-src-pos="1559..1607">Read the first line of this file into a variable</span> <code md-src-pos="1608..1619">firstline</code><span md-src-pos="1619..1620">.</span> <span md-src-pos="1621..1650">You can use the linux command</span> <a href="http://www.linfo.org/head.html" md-src-pos="1651..1689">head</a> <span md-src-pos="1690..1707">for this purpose.</span></p>
   <p md-src-pos="1709..1711"><span md-src-pos="1709..1711">--</span></p>
   <p md-src-pos="1713..1922"><strong md-src-pos="1713..1719">4.</strong> <span md-src-pos="1720..1784">We want just the version number without the markdown formatting.</span> <span md-src-pos="1785..1796">The command</span> <a href="http://linuxcommand.org/lc3_man_pages/readh.html" md-src-pos="1797..1853">read</a> <span md-src-pos="1854..1907">can be used to split a string into an array using the</span> <code md-src-pos="1908..1912">-a</code> <span md-src-pos="1913..1922">argument.</span></p>
   <p md-src-pos="1924..1985"><span md-src-pos="1924..1940">Split the string</span> <code md-src-pos="1941..1952">firstline</code> <span md-src-pos="1953..1967">into the array</span> <code md-src-pos="1968..1984">splitfirstline</code><span md-src-pos="1984..1985">.</span></p>
   <p md-src-pos="1987..2050"><span md-src-pos="1987..2020">The syntax for splitting a string</span> <code md-src-pos="2021..2026">foo</code> <span md-src-pos="2027..2040">into an array</span> <code md-src-pos="2041..2046">bar</code> <span md-src-pos="2047..2049">is</span>:</p>
   <p md-src-pos="2052..2074"><code md-src-pos="2052..2074">read -a bar &lt;&lt;&lt; $foo</code></p>
   <p md-src-pos="2076..2078"><span md-src-pos="2076..2078">--</span></p>
   <p md-src-pos="2080..2208"><strong md-src-pos="2080..2086">5.</strong> <span md-src-pos="2087..2150">Now we are ready to set the value of the version of the script.</span> <span md-src-pos="2151..2173">It is located in index</span> <code md-src-pos="2174..2177">1</code> <span md-src-pos="2178..2190">of the array</span> <code md-src-pos="2191..2207">splitfirstline</code><span md-src-pos="2207..2208">.</span></p>
   <p md-src-pos="2210..2277"><span md-src-pos="2210..2247">The syntax for accessing the value at</span> <code md-src-pos="2248..2255">index</code> <span md-src-pos="2256..2267">of an array</span> <code md-src-pos="2268..2273">foo</code> <span md-src-pos="2274..2276">is</span>:</p>
   <p md-src-pos="2279..2294"><code md-src-pos="2279..2294">${foo[index]}</code></p>
   <p md-src-pos="2296..2338"><span md-src-pos="2296..2327">Save the version to a variable,</span> <code md-src-pos="2328..2337">version</code><span md-src-pos="2337..2338">.</span></p>
   <p md-src-pos="2340..2436"><span md-src-pos="2340..2426">Print a statement to the terminal notifying the user of the version they are building.</span> <br><br></p>
   <p md-src-pos="2438..2440"><span md-src-pos="2438..2440">--</span></p>
   <h4 md-src-pos="2442..2460"><strong md-src-pos="2446..2460">USER INPUT</strong></h4>
   <p md-src-pos="2462..2562"><strong md-src-pos="2462..2468">6.</strong> <span md-src-pos="2469..2562">Let’s give the user a chance to exit the script if they need to make a change to the version.</span></p>
   <p md-src-pos="2564..2637"><span md-src-pos="2564..2585">Ask the user to enter</span> <span md-src-pos="2586..2589">“1”</span> (<span md-src-pos="2591..2598">for yes</span>) <span md-src-pos="2600..2615">to continue and</span> <span md-src-pos="2616..2619">“0”</span> (<span md-src-pos="2621..2627">for no</span>) <span md-src-pos="2629..2637">to exit.</span></p>
   <p md-src-pos="2639..2705"><span md-src-pos="2639..2676">Assign their response to the variable</span> <code md-src-pos="2677..2694">versioncontinue</code><span md-src-pos="2694..2695">.</span> <br><br></p>
   <p md-src-pos="2707..2709"><span md-src-pos="2707..2709">--</span></p>
   <h4 md-src-pos="2711..2735"><strong md-src-pos="2715..2735">CONGRATULATIONS!</strong></h4>
   <p md-src-pos="2737..2872"><strong md-src-pos="2737..2743">7.</strong> <span md-src-pos="2744..2762">Add a conditional.</span> <span md-src-pos="2763..2779">If the user said</span> <span md-src-pos="2780..2783">“1”</span> <span md-src-pos="2784..2809">to the continue question,</span> <span md-src-pos="2810..2849">we will execute the rest of our script.</span> <span md-src-pos="2850..2858">For now,</span> <span md-src-pos="2859..2866">respond</span> <span md-src-pos="2867..2872">“OK”.</span></p>
   <p md-src-pos="2874..2953"><span md-src-pos="2874..2894">If the user did not,</span> <span md-src-pos="2895..2904">tell them</span> <span md-src-pos="2905..2943">“Please come back when you are ready”.</span> <br><br></p>
   <p md-src-pos="2955..2957"><span md-src-pos="2955..2957">--</span></p>
   <h4 md-src-pos="2959..2980"><strong md-src-pos="2963..2980">COPYING FILES</strong></h4>
   <p md-src-pos="2982..3078"><strong md-src-pos="2982..2988">8.</strong> <span md-src-pos="2989..3024">Now we want to copy every file from</span> <strong md-src-pos="3025..3035">source</strong> <span md-src-pos="3036..3038">to</span> <strong md-src-pos="3039..3048">build</strong> <span md-src-pos="3049..3059">except for</span> <strong md-src-pos="3060..3077">secretinfo.md</strong><span md-src-pos="3077..3078">.</span></p>
   <p md-src-pos="3080..3250"><span md-src-pos="3080..3111">Within the positive conditional</span> (<span md-src-pos="3113..3135">where we told the user</span> <span md-src-pos="3136..3140">“OK”</span>)<span md-src-pos="3141..3142">,</span> <span md-src-pos="3143..3187">start by iterating over all the files in the</span> <strong md-src-pos="3188..3198">source</strong> <span md-src-pos="3199..3250">directory and printing their names to the terminal.</span></p>
   <p md-src-pos="3252..3254"><span md-src-pos="3252..3254">--</span></p>
   <p md-src-pos="3256..3368"><strong md-src-pos="3256..3262">9.</strong> <span md-src-pos="3263..3275">Check if the</span> <code md-src-pos="3276..3286">filename</code> <span md-src-pos="3287..3289">is</span> <span md-src-pos="3290..3313">“source/secretinfo.md”.</span> <span md-src-pos="3314..3323">If it is,</span> <span md-src-pos="3324..3368">inform the user that it is not being copied.</span></p>
   <p md-src-pos="3370..3421"><span md-src-pos="3370..3380">Otherwise,</span> <span md-src-pos="3381..3421">inform the user that it is being copied.</span></p>
   <p md-src-pos="3423..3474"><span md-src-pos="3423..3474">Make sure to use spaces in your string conditional.</span></p>
   <p md-src-pos="3476..3478"><span md-src-pos="3476..3478">--</span></p>
   <p md-src-pos="3480..3616"><strong md-src-pos="3480..3487">10.</strong> <span md-src-pos="3488..3523">Now we can actually copy the files.</span> <span md-src-pos="3524..3574">After informing the user the file is being copied,</span> <span md-src-pos="3575..3597">copy the file into the</span> <code md-src-pos="3598..3605">build</code> <span md-src-pos="3606..3616">directory.</span></p>
   <p md-src-pos="3618..3689"><span md-src-pos="3618..3688">You can use the terminal to make sure the right files have been copied</span>:</p>
   <p md-src-pos="3691..3712"><code md-src-pos="3691..3702">ls build/</code> <br><br></p>
   <p md-src-pos="3714..3716"><span md-src-pos="3714..3716">--</span></p>
   <h4 md-src-pos="3718..3739"><strong md-src-pos="3722..3739">LISTING FILES</strong></h4>
   <p md-src-pos="3740..3836"><strong md-src-pos="3740..3747">11.</strong> <span md-src-pos="3748..3802">The final thing we want to do is list the files in the</span> <strong md-src-pos="3803..3812">build</strong> <span md-src-pos="3813..3836">directory for the user.</span></p>
   <p md-src-pos="3838..4052"><span md-src-pos="3838..3894">Outside of the loop over the filenames in the directory,</span> <span md-src-pos="3895..3957">use the script to change the directory to the build directory.</span> <span md-src-pos="3958..3982">So that we don’t forget,</span> <span md-src-pos="3983..4052">also add the command to change back to the directory with the script.</span></p>
   <p md-src-pos="4054..4056"><span md-src-pos="4054..4056">--</span></p>
   <p md-src-pos="4058..4142"><strong md-src-pos="4058..4065">12.</strong> <span md-src-pos="4066..4142">Add code to notify the user what files are currently in the build directory.</span></p>
   <p md-src-pos="4144..4193"><span md-src-pos="4144..4193">Be sure to reference the version in your message.</span></p>
   <p md-src-pos="4195..4197"><span md-src-pos="4195..4197">--</span></p>
   <p md-src-pos="4199..4320"><strong md-src-pos="4199..4206">13.</strong> <span md-src-pos="4207..4255">You now have a build script for this repository.</span> <span md-src-pos="4256..4308">Feel free to play around with making it more robust.</span> <span md-src-pos="4309..4319">Some ideas</span>:</p>
   <ul md-src-pos="4322..4420">
    <li md-src-pos="4322..4374">Copy <strong md-src-pos="4329..4346">secretinfo.md</strong> but replace “42” with “XX”.</li>
    <li md-src-pos="4375..4420">Give the script more character with emojis.</li>
   </ul>
  </div>
 </body>
</html>