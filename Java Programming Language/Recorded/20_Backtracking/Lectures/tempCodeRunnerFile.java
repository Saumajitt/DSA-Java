
            }
            return;
        }


        findSubsets(str, ans+str.charAt(i), i+1); //yes
        findSubsets(str, ans, i+1); //no
    }
}
