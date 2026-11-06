import pandas as pd

def tree_node(tree: pd.DataFrame) -> pd.DataFrame:
    
    parent_nodes = tree["p_id"].dropna().unique()

    def determine_type(row):

        if pd.isna(row["p_id"]):
            return "Root"
        elif row["id"] in parent_nodes:
            return "Inner"
        else:
            return "Leaf"

    tree["type"] = tree.apply(determine_type, axis=1)

    return tree[["id", "type"]]       