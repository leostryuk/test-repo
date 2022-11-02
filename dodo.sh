for ((i=0;i<5;i++)); 
do 
   echo $i >> aa.log    
   git add .
   git commit -m "opilki v golove $i"
   # your-unix-command-here
   echo $i
   sleep 0.3
done

#little motherfucker
