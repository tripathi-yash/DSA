import pandas as pd

def actors_and_directors(actor_director: pd.DataFrame) -> pd.DataFrame:
    
    grouped = actor_director.groupby(['actor_id', 'director_id']).size().reset_index(name = 'count')

    ans = grouped[['actor_id','director_id']][grouped['count'] >= 3]

    return ans