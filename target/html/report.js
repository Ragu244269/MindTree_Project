$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ANZ.feature");
formatter.feature({
  "line": 2,
  "name": "ANZ Repayments Calculator",
  "description": "",
  "id": "anz-repayments-calculator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ANZ"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Estimation for Living Expenses",
  "description": "",
  "id": "anz-repayments-calculator;estimation-for-living-expenses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@FunctionalTesting"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Living Expenses with details",
  "rows": [
    {
      "cells": [
        "AT",
        "ND",
        "AProperty",
        "YI",
        "YOI",
        "LE",
        "CHLR",
        "OLR",
        "OC",
        "TCCL"
      ],
      "line": 7
    },
    {
      "cells": [
        "Single",
        "0",
        "Home to live in",
        "80000",
        "10000",
        "500",
        "0",
        "275",
        "0",
        "10000"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Borrowing estimate as \"Y\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Start Over",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Living Expenses with details",
  "rows": [
    {
      "cells": [
        "AT",
        "ND",
        "AProperty",
        "YI",
        "YOI",
        "LE",
        "CHLR",
        "OLR",
        "OC",
        "TCCL"
      ],
      "line": 12
    },
    {
      "cells": [
        "Single",
        "0",
        "Home to live in",
        "0",
        "0",
        "1",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 13
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Borrowing estimate as \"N\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ANZ_TC.details(DataTable)"
});
formatter.result({
  "duration": 3006711200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 23
    }
  ],
  "location": "ANZ_TC.estimate(String)"
});
formatter.result({
  "duration": 180483700,
  "status": "passed"
});
formatter.match({
  "location": "ANZ_TC.startOver()"
});
formatter.result({
  "duration": 295490800,
  "status": "passed"
});
formatter.match({
  "location": "ANZ_TC.details(DataTable)"
});
formatter.result({
  "duration": 2057845000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N",
      "offset": 23
    }
  ],
  "location": "ANZ_TC.estimate(String)"
});
formatter.result({
  "duration": 169841200,
  "status": "passed"
});
});