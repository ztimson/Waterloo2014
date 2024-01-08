<!-- Header -->
<div id="top" align="center">
  <br />

  <!-- Logo -->
  <img src="https://git.zakscode.com/repo-avatars/a01fb323d258d636e34b2452a55959263e06e7225034d69b9093cd1073a96f8d" alt="Logo" width="200" height="200">

  <!-- Title -->
  ### Waterloo-2014

  <!-- Description -->
  Simple repository template

  <!-- Repo badges -->
  [![Version](https://img.shields.io/badge/dynamic/json.svg?label=Version&style=for-the-badge&url=https://git.zakscode.com/api/v1/repos/ztimson/waterloo-2014/tags&query=$[0].name)](https://git.zakscode.com/ztimson/waterloo-2014/tags)
  [![Pull Requests](https://img.shields.io/badge/dynamic/json.svg?label=Pull%20Requests&style=for-the-badge&url=https://git.zakscode.com/api/v1/repos/ztimson/waterloo-2014&query=open_pr_counter)](https://git.zakscode.com/ztimson/waterloo-2014/pulls)
  [![Issues](https://img.shields.io/badge/dynamic/json.svg?label=Issues&style=for-the-badge&url=https://git.zakscode.com/api/v1/repos/ztimson/waterloo-2014&query=open_issues_count)](https://git.zakscode.com/ztimson/waterloo-2014/issues)

  <!-- Links -->

  ---
  <div>
    <a href="https://git.zakscode.com/ztimson/waterloo-2014/releases" target="_blank">Release Notes</a>
    • <a href="https://git.zakscode.com/ztimson/waterloo-2014/issues/new?template=.github%2fissue_template%2fbug.md" target="_blank">Report a Bug</a>
    • <a href="https://git.zakscode.com/ztimson/waterloo-2014/issues/new?template=.github%2fissue_template%2fenhancement.md" target="_blank">Request a Feature</a>
  </div>

  ---
</div>

## Table of Contents
- [Waterloo-2014](#top)
    - [About](#about)
        - [Built With](#built-with)
    - [Setup](#setup)
        - [Development](#development)
    - [License](#license)

## About

In 2014 I competed in Waterloo's senior programing cometition.

These programs correspond to the problems found inside [Waterloo-2014.pdf](./Waterloo-2014.pdf).

#### Rules:
- 3 hours to complete as many problems as possible; only completed programs count
- Only writen resorces are allowed to be brought in and used (No internet/search engine)
- Every file must use file input and standard output (Names correspond (src.S1.java < src.S1.txt))
- Some programs are rated on efficency

#### Results
- 1st place in local area, doubling 2nd place's score
- src.S1 completed every test & recieved full marks (40 points)
- src.S2 completed every test & recieved full marks (40 points)
- src.S3 only halfed worked (15 points), I rushed to move onto src.S4
- src.S4 didn't have time to complete

In hindsight, knowing I only needed to pass 3 problems to advance to nationals, I should have focused on the 3 easiest problems & ensured they all worked instead of rushing through all of the problems & ending up with two half-complete.

### Built With
[![Java](https://img.shields.io/badge/Java-5382A1?style=for-the-badge&logo=coffeescript&logoColor=F8981D)](https://java.com/)

## Setup

<details>
<summary>
  <h3 id="development" style="display: inline">
    Development
  </h3>
</summary>

#### Prerequisites
- [Java SDK](https://www.oracle.com/ca-en/java/technologies/downloads)

#### Instructions
1. Compile & run each program: 
   - `javac src/S1.java && java src/S1 << data/S1.txt`
   - `javac src/S2.java && java src/S2 << data/S2.txt`
   - `javac src/S3.java && java src/S3 << data/S3.txt`
   - `javac src/S4.java && java src/S4 << data/S4.txt`

</details>

## License
Copyright © 2023 Zakary Timson | All Rights Reserved

See the [license](./LICENSE) for more information.
