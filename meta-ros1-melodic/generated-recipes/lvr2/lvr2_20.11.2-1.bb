# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Las Vegas Surface Reconstruction Toolkit is an Open Source toolkit to reconstruct triangle meshes from unordered point clouds. It supports the generation of textured models either using colored point clouds or point clouds plus images and according calibration matrices. The LVR toolkit provides an Open Source C++ API for meshing and texture generation as well as an I/O interface to store the generated meshes in different exchange formats including Stanford PLY, Wavefront OBJ and Collada. In contrast to other meshing software, it focuses on reconstruction of large scale environments on city scale from high resolution point clouds."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Thomas Wiemann <twiemann@uos.de>"
HOMEPAGE = "https://www.las-vegas.uni-osnabrueck.de/"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "lvr2"
ROS_BPN = "lvr2"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libvtk-qt} \
    ${ROS_UNRESOLVED_DEP-libvtk} \
    ${ROS_UNRESOLVED_DEP-ocl-icd-opencl-dev} \
    boost \
    freeglut \
    gsl \
    hdf5 \
    libeigen \
    libflann \
    libxi \
    libxmu \
    lz4 \
    opencv \
    qtbase \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libvtk-qt} \
    ${ROS_UNRESOLVED_DEP-libvtk} \
    ${ROS_UNRESOLVED_DEP-ocl-icd-opencl-dev} \
    boost \
    freeglut \
    gsl \
    hdf5 \
    libeigen \
    libflann \
    libxi \
    libxmu \
    lz4 \
    opencv \
    qtbase \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libvtk-qt} \
    ${ROS_UNRESOLVED_DEP-libvtk} \
    ${ROS_UNRESOLVED_DEP-ocl-icd-opencl-dev} \
    boost \
    freeglut \
    gsl \
    hdf5 \
    libeigen \
    libflann \
    libxi \
    libxmu \
    lz4 \
    opencv \
    qtbase \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/lvr2-release/archive/release/melodic/lvr2/20.11.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/lvr2"
SRC_URI = "git://github.com/uos-gbp/lvr2-release;${ROS_BRANCH};protocol=https"
SRCREV = "6300d1476f13577d18c7c70e33c98551dbe557df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}