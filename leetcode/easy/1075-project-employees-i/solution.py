import pandas as pd

def project_employees_i(project: pd.DataFrame, employee: pd.DataFrame) -> pd.DataFrame:
    
    merged = pd.merge(
        left = project,
        right = employee,
        on = "employee_id",
        how = "inner"
    )

    grouped = merged.groupby('project_id')['experience_years'].mean().reset_index()

    grouped = grouped.rename(columns = {"experience_years" : "average_years"})
    grouped["average_years"] = grouped["average_years"].round(2)

    return grouped