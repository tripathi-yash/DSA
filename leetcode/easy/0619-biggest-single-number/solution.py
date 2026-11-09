import pandas as pd

def biggest_single_number(my_numbers: pd.DataFrame) -> pd.DataFrame:
    my_numbers = my_numbers.drop_duplicates(keep=False)

    max_ = my_numbers.max()

    return pd.DataFrame({"num" : max_})

    
