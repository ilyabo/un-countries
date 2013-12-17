# un-countries

Tries to find best matches in the UN countries list by the country names
helping to overcome the problem caused by the use of non-canonical spellings
of the country names.

## Prerequisites

Install Leiningen:

    brew install leiningen

## Usage

    lein git-deps
    echo "Congo" | lein run

The above will produce the following results sorted by similarity score in descending order:
    
    [{"query":"Congo",
      "results":
      [{"country":{"code":"COG", "name":"Congo", "numcode":"178"},
        "score":100000.0},
       {"country":
        {"code":"COD",
         "name":"Democratic Republic of the Congo",
         "numcode":"180"},
        "score":99977.0},
       {"country":{"code":"COM", "name":"Comoros", "numcode":"174"},
        "score":92.0},
       {"country":{"code":"COL", "name":"Colombia", "numcode":"170"},
        "score":91.0},
       {"country":{"code":"CRI", "name":"Costa Rica", "numcode":"188"},
        "score":90.0},
       {"country":{"code":"COK", "name":"Cook Islands", "numcode":"184"},
        "score":88.0}]}]
