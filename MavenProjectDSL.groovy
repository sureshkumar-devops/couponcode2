job('First-Maven-Project-Via-DSL')
{
  description("Firt Maven job generated by the DSL on ${new Date()},The project is a small Maven Project hosted on GitHub..!")
  scm{
     git("https://github.com/sureshkumar-devops/couponcode2.git", 'master')
  }
  triggers{
    scm('* * * * *')
  }
  steps{
    maven('clean package','pom.xml')
  }
  publishers{
    archiveArtifacts '**/*.war'
  }

}