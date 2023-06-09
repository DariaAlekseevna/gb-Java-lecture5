Множество коллекций Map: Хранение и обработка данных, чаcть II

 План лекции:
 - Обзор функционала Map
 - Зачем нужен HashMap
 - HashMap и работа с ним
 - Обзор функционала TreeMap
 - Обзор функционала LinkedHashMap
 - Примеры

0. Коллекции 

    Иерархия коллекций

1. Обзор функционала Map

    Иерархия коллекций
    Map: HashMap (LinkedHashMap), SortedMap (NavigableMap((TreeMap)), HashTable)
    HashTable - устаревшая коллекция

2. HashMap

    Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.
    Ключевые особенности:
     ● ускоренная обработка данных;
     ● порядок добавления не запоминается.
    В HashMap элементы располагаются как угодно и могут менять свое положение.
     ● допускаются только уникальные ключи, значения могут повторяться;
     ● помните про null значения*;
     ● ускоренная обработка данных;
     ● порядок добавления не запоминается.

    Функционал HashMap:
     put(K,V) – добавить пару если или изменить значение,если ключ имеется.
     putIfAbsent(K,V) – произвести добавление если ключ не найден.
     get(K) - получение значения по указанному ключу.
     remove(K) – удаляет пару по указанному ключу.
     containsValue(V) – проверка наличия значения.
     containsKey(V) – проверка наличия ключа.
     keySet() – возвращает множество ключей.
     values() – возвращает набор значений.

    Как хранятся данные в HashMap:

        | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        |   |   |   |   |   |   |   |   |   |

    Map<Integer, String> db = new HashMap<>();
    db.put(1, "один");  нам нужен hash    => 2809   => ОСТ10 2809 = 9
        | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        |   |   |   |   |   |   |   |   | * |
                                        1, "один"
                                        null
    db.put(3, "три"); => 1990 => ОСТ101990 = 0
        | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        | * |   |   |   |   |   |   |   | * |
        3, "три"
        null
    db.put(13, "один три"); => 2090 => ОСТ102090 = 0
        | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        | * |   |   |   |   |   |   |   | * |
        |3, "три"| -> |13, "один три"|
        |    *   |    |     null     |

    HashMap. Любознательным:
     ● Хэш-функции и хэш-таблицы
     ● Прямое связывание (хэширование с цепочками)
     ● Хэширование с открытой адресацией
     ● Теория графов:
     ● деревья построенные на списках
     ● бинарные деревья
     ● сбалансированные деревья
     ● *алгоритм балансировки дерева
     ● ** красно-черные деревья, деревья поиска

4. TreeMap

    Методы, на которые нужно обратить внимание:
     ● put(K,V) 
     ● get(K) 
     ● remove(K)
     ● descendingKeySet(V)
     ● descendingMap() 
     ● tailMap() 
     ● headMap() 
     ● lastEntry() 
     ● firstEntry()

     В основе данной коллекции лежат красно-чёрное деревья.
     Позволяют быстрее искать, но могут возникнуть «заминки» при добавлении.

    TreeMap:
     2, 4, 6, 1, 3, 5, 7, 8, 9
                                        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9
                5
            |       |
            3       8
        |   |       |   |
        2   4       7   9
    |  |    |  |   |  |   |  |
    1  *    *  *   6  *   *  *




5. LinkedHashMap

    «Старший брат» коллекции HashMap, который все помнит…
    Помнит порядок добавления элементов ➜ более медлительный
    Map<Integer,String> linkmap = new LinkedHashMap<>();



6. HashTable

    «Устаревший брат» коллекции HashMap, который не знает про null