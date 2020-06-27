/*author - Ashutosh Chitranshi*/
void Solution::rotate(vector<vector<int> > &A) {
    int n = A.size();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            swap(A[i][j],A[j][i]);
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n/2;j++)
        {
            swap(A[i][j],A[i][n-1-j]);
        }
    }
}
