GCiphers CLI
------------
>Analytical command line app for 23 ciphers, using Os-Lib, Ox, uPickle and Scala 3.

Ciphers
-------
1. Ordinal
2. ReverseOrdinal
3. Reduction 
4. ReverseReduction 
5. Standard
6. ReverseStandard
7. Latin  
8. Sumerian
9. ReverseSumerian
10. Primes
11. ReversePrimes
12. Fibonacci
13. Squares
14. ReverseSquares
15. Trigonal
16. ReverseTrigonal
17. SingleReduction
18. ReverseSingleReduction
19. Keypad
20. Chaldean
21. Septenary
22. Satanic
23. ReverseSatanic

Features
--------
1. **Date:** Date properties, encodings and date diff.
2. **Texts:** Number to Texts mappings.
3. **Numbers:** Math properties per selected encoded number.
4. **Encodings:** Encoded numbers across multiple ciphers.
5. **Enter:** Text and number data entry.
6. **Clear:** Clears all data entry and analysis.

Install
-------
>See: http://www.scala-native.org/en/latest/user/setup.html
1. brew install llvm

Build
-----
1. ```sbt clean compile```

Test
----
1. ```sbt clean test```

Publish
-------
1. ```sbt clean compile nativeLink```
2. ```mv target/scala-3.7.0-RC3/gciphers-native-cli target/scala-3.7.0-RC3/gciphers```
3. ```sudo cp target/scala-3.7.0-RC3/gciphers /usr/local/bin```

Commands
--------
>Help is printed with command 0 or an empty command.
0. h
1. t --text test
2. n --number 1
3. d --date 2025-01-01
4. nt --numbertexts 1

Execute
-------
0. gciphers | gciphers h
1. gciphers t --text test
2. gciphers n --number 1
3. gciphers d --date 2025-01-01
4. gciphers nt --numbertexts 1

Persistence
-----------
>**Data**, as json files, is stored here:
```
~/.gciphers/store
```

Logging
-------
>**Log** files are stored here:
```
~/.gciphers/log
```

License
-------
>Copyright (c) [2025] [Objektwerks]

>Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    * http://www.apache.org/licenses/LICENSE-2.0

>Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
