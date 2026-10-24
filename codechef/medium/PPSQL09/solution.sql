-- your code goes here
select song_id 
from song 
where song_id not in (
    select song_id 
    from belongs_to
    );