# PPSQL09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

Dotify is a music streaming platform where users can create playlists and add songs to them. A song can belong to multiple playlists, while some songs may not belong to any playlist.

The platform needs to identify songs that have not been added to any playlist.

The database contains two relevant tables:

 **Table 1: Song (selected records)** 

song_id	song_name
1	On My Way
8	Burn Up The Winter
11	Powerful Hero
19	Regretful Nature
20	Discover Cold Hand

 **Table 2: Belongs_to (selected records)** 

song_id	playlist_id
1	6
8	5
11	3
19	19

The tables above show selected records from the original dataset. The database used for evaluation contains the complete tables, with song IDs `1` through `19` appearing in `Belongs_to` and song `20` having no playlist association.

 **Task** 

Write an SQL query to retrieve the IDs of all songs that are not included in any playlist.

The query must:

- Return only the song_id column.
- Include songs with no corresponding record in the Belongs_to table.
- Return each qualifying song ID exactly once.

 **Expected Output** 

song_id
20

 **Note:**  The tables are already created and populated. Write only the SQL query. The order of the returned rows is not significant.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:29:49.567Z  

```sql
-- your code goes here
select song_id 
from song 
where song_id not in (
    select song_id 
    from belongs_to
    );
```

---

[View on CodeChef](https://www.codechef.com/problems/PPSQL09)